package com.ridderware.jrandom;

public class JavaRandom extends java.util.Random implements RandomNumberGenerator {
    private static RandomNumberGenerator singleton = null;

    /**
     *  Gets the Instance attribute of the MersenneTwisterFast class
     *
     * @return    TBD
     */
    public static RandomNumberGenerator getInstance()
    {
        if (singleton == null)
        {
            singleton = new JavaRandom();
        }
        return singleton;
    }

    @Override
    public short nextShort() {
        return (short) next(16);
    }

    @Override
    public char nextChar() {
        return (char) (next(16));
    }


    /**
     * This generates a coin flip with a probability <tt>probability</tt>
     * of returning true, else returning false. <tt>probability</tt> must
     * be between 0.0 and 1.0, inclusive.  Not as precise a random real
     * event as nextBoolean(double), but twice as fast. To explicitly
     * use this, remember you may need to cast to float first.
     */
    @Override
    public boolean nextBoolean(float probability) {
        if (probability < 0.0f || probability > 1.0f)
            throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
        if (probability == 0.0f) return false;            // fix half-open issues
        else if (probability == 1.0f) return true;        // fix half-open issues
        return nextFloat() < probability;
    }

    /**
     * This generates a coin flip with a probability <tt>probability</tt>
     * of returning true, else returning false. <tt>probability</tt> must
     * be between 0.0 and 1.0, inclusive.
     */
    @Override
    public boolean nextBoolean(double probability) {
        if (probability < 0.0 || probability > 1.0)
            throw new IllegalArgumentException("probability must be between 0.0 and 1.0 inclusive.");
        if (probability == 0.0) return false;             // fix half-open issues
        else if (probability == 1.0) return true; // fix half-open issues
        return nextDouble() < probability;
    }

    @Override
    public long nextLong(long n) {
        if (n<=0)
            throw new IllegalArgumentException("n must be positive, got: " + n);

        long bits, val;
        do
        {
            bits = (nextLong() >>> 1);
            val = bits % n;
        }
        while(bits - val + (n-1) < 0);
        return val;
    }

}