/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

/**
 *
 * @author ASUS
 */
public class DistanceMatrix {
    
  /**
   * Origin addresses as returned by the API from your original request. These are formatted by the
   * geocoder and localized according to the language parameter passed with the request.
   */
  public final String[] originAddresses;

  /**
   * Destination addresses as returned by the API from your original request. As with {@link
   * #originAddresses}, these are localized if appropriate.
   */
  public final String[] destinationAddresses;

  /**
   * An array of elements, each of which in turn contains a status, duration, and distance element.
   */
  public final DistanceMatrixRow[] rows;

  public DistanceMatrix(
      String[] originAddresses, String[] destinationAddresses, DistanceMatrixRow[] rows) {
    this.originAddresses = originAddresses;
    this.destinationAddresses = destinationAddresses;
    this.rows = rows;
  }

}
