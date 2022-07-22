/* %%
 *
 * jRandom  *
 */

package com.ridderware.jrandom;

/**
 *  Random number generators provided by this framework all comply to this
 *  interface.
 */

public interface RandomNumberGenerator {


  public void setSeed(long seed);


  /**
   *  The next element in the sequence as an int.
   *
   * @return    An int.
   */
  public int nextInt();


  /**
   *  The next element in the sequence as a short.
   *
   * @return    A short.
   */
  public short nextShort();


  /**
   *  The next element in the sequence as a char.
   *
   * @return    A char.
   */
  public char nextChar();


  /**
   *  The next element in the sequence as a boolean.
   *
   * @return    A boolean.
   */
  public boolean nextBoolean();


  /**
   *  The next element in the sequence as a boolean with the probability of a
   *  true weighted according to the specified probability. Probability must be
   *  between 0.0 and 1.0 inclusive.
   *
   * @param  probability  The probability of returning true.
   * @return              A boolean.
   */
  public boolean nextBoolean(float probability);


  /**
   *  The next element in the sequence as a boolean with the probability of a
   *  true weighted according to the specified probability. Probability must be
   *  between 0.0 and 1.0 inclusive.
   *
   * @param  probability  The probability of returning true.
   * @return              A boolean.
   */
  public boolean nextBoolean(double probability);


  /**
   *  Fill the specified array with the next array.length bytes from the random
   *  sequence.
   *
   * @param  bytes  The array to fill.
   */
  public void nextBytes(byte[] bytes);


  /**
   *  The next element in the sequence as a long.
   *
   * @return    A long.
   */
  public long nextLong();


  /**
   *  The next element in the sequence as a long in the range 0 (inclusive) to n
   *  (exclusive).
   * @param n exclusive maximum value returned
   * @return A long.
   */
  public long nextLong(long n);


  /**
   *  The next element in the sequence as a double in the range 0.0 (inclusive)
   *  to 1.0 (inclusive).
   *
   * @return    random double
   */
  public double nextDouble();


  /**
   *  The next double from a Gaussian distribution.
   *
   * @return    A double.
   */
  public double nextGaussian();


  /**
   *  The next element in the sequence as a float.
   *
   * @return    A float.
   */
  public float nextFloat();


  /**
   *  The next element in the sequence as a long in the range 0 (inclusive) to n
   *  (exclusive).
   * @param n The max value (exclusive, ex. 5 means max value returned is 4)
   * @return A long.
   */
  public int nextInt(int n);

}
