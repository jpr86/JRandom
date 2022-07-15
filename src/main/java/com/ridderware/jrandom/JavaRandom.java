package com.ridderware.jrandom;

public class JavaRandom extends java.util.Random implements RandomNumberGenerator {
    @Override
    public short nextShort() {
        return (short) next(16);
    }

    @Override
    public char nextChar() {
        return (char)(next(16));
    }


    /** This generates a coin flip with a probability <tt>probability</tt>
     of returning true, else returning false. <tt>probability</tt> must
     be between 0.0 and 1.0, inclusive.  Not as precise a random real
     event as nextBoolean(double), but twice as fast. To explicitly
     use this, remember you may need to cast to float first. */
    @Override
    public boolean nextBoolean (float probability)
    {
        if (probability < 0.0f || probability > 1.0f)
            throw new IllegalArgumentException ("probability must be between 0.0 and 1.0 inclusive.");
        if (probability==0.0f) return false;            // fix half-open issues
        else if (probability==1.0f) return true;        // fix half-open issues
        return nextFloat() < probability;
    }

    /** This generates a coin flip with a probability <tt>probability</tt>
     of returning true, else returning false. <tt>probability</tt> must
     be between 0.0 and 1.0, inclusive. */
@Override
    public boolean nextBoolean (double probability)
    {
        if (probability < 0.0 || probability > 1.0)
            throw new IllegalArgumentException ("probability must be between 0.0 and 1.0 inclusive.");
        if (probability==0.0) return false;             // fix half-open issues
        else if (probability==1.0) return true; // fix half-open issues
        return nextDouble() < probability;
    }


    @Override
    public byte nextByte() {
        return 0;
    }

    @Override
    public boolean isDeprecated() {
        return super.isDeprecated();
    }

    @Override
    public float nextFloat(float bound) {
        return super.nextFloat(bound);
    }

    @Override
    public float nextFloat(float origin, float bound) {
        return super.nextFloat(origin, bound);
    }

    @Override
    public double nextDouble(double bound) {
        return super.nextDouble(bound);
    }

    @Override
    public double nextDouble(double origin, double bound) {
        return super.nextDouble(origin, bound);
    }

    @Override
    public int nextInt(int origin, int bound) {
        return super.nextInt(origin, bound);
    }

    @Override
    public long nextLong(long bound) {
        return super.nextLong(bound);
    }

    @Override
    public long nextLong(long origin, long bound) {
        return super.nextLong(origin, bound);
    }

    @Override
    public double nextGaussian(double mean, double stddev) {
        return super.nextGaussian(mean, stddev);
    }

    @Override
    public double nextExponential() {
        return super.nextExponential();
    }
}