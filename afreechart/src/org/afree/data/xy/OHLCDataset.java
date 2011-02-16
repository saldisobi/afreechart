/* ===========================================================
 * AFreeChart : a free chart library for Android(tm) platform.
 *              (based on JFreeChart and JCommon)
 * ===========================================================
 *
 * (C) Copyright 2010, by Icom Systech Co., Ltd.
 * (C) Copyright 2000-2008, by Object Refinery Limited and Contributors.
 *
 * Project Info:
 *    AFreeChart: http://code.google.com/p/afreechart/
 *    JFreeChart: http://www.jfree.org/jfreechart/index.html
 *    JCommon   : http://www.jfree.org/jcommon/index.html
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * [Android is a trademark of Google Inc.]
 *
 * ----------------
 * OHLCDataset.java
 * ----------------
 * 
 * (C) Copyright 2010, by Icom Systech Co., Ltd.
 *
 * Original Author:  shiraki  (for Icom Systech Co., Ltd);
 * Contributor(s):   Sato Yoshiaki ;
 *                   Niwano Masayoshi;
 *
 * Changes (from 19-Nov-2010)
 * --------------------------
 * 19-Nov-2010 : port JFreeChart 1.0.13 to Android as "AFreeChart"
 * 
 * ------------- JFreeChart ---------------------------------------------
 * (C) Copyright 2001-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   Sylvain Vieujot;
 *
 * Changes (from 18-Sep-2001)
 * --------------------------
 * 18-Sep-2001 : Updated header info (DG);
 * 16-Oct-2001 : Moved to package com.jrefinery.data.* (DG);
 * 22-Oct-2001 : Renamed DataSource.java --> Dataset.java etc. (DG);
 * 05-Feb-2002 : Added getVolumeValue() method, as requested by Sylvain
 *               Vieujot (DG);
 * 05-May-2004 : Added methods that return double primitives (DG);
 * 26-Jul-2004 : Switched names of methods that return Number vs
 *               primitives (DG);
 * 06-Sep-2004 : Renamed HighLowDataset --> OHLCDataset (DG);
 *
 */

package org.afree.data.xy;

/**
 * An interface that defines data in the form of (x, high, low, open, close)
 * tuples.
 */
public interface OHLCDataset extends XYDataset {

    /**
     * Returns the high-value for the specified series and item.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The value.
     */
    public Number getHigh(int series, int item);

    /**
     * Returns the high-value (as a double primitive) for an item within a
     * series.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The high-value.
     */
    public double getHighValue(int series, int item);

    /**
     * Returns the low-value for the specified series and item.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The value.
     */
    public Number getLow(int series, int item);

    /**
     * Returns the low-value (as a double primitive) for an item within a
     * series.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The low-value.
     */
    public double getLowValue(int series, int item);

    /**
     * Returns the open-value for the specified series and item.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The value.
     */
    public Number getOpen(int series, int item);

    /**
     * Returns the open-value (as a double primitive) for an item within a
     * series.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The open-value.
     */
    public double getOpenValue(int series, int item);

    /**
     * Returns the y-value for the specified series and item.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The value.
     */
    public Number getClose(int series, int item);

    /**
     * Returns the close-value (as a double primitive) for an item within a
     * series.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The close-value.
     */
    public double getCloseValue(int series, int item);

    /**
     * Returns the volume for the specified series and item.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The value.
     */
    public Number getVolume(int series, int item);

    /**
     * Returns the volume-value (as a double primitive) for an item within a
     * series.
     * 
     * @param series
     *            the series (zero-based index).
     * @param item
     *            the item (zero-based index).
     * 
     * @return The volume-value.
     */
    public double getVolumeValue(int series, int item);

}