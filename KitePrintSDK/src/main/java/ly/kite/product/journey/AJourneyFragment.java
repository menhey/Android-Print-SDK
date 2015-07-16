/*****************************************************
 *
 * AJourneyFragment.java
 *
 *
 * Modified MIT License
 *
 * Copyright (c) 2010-2015 Kite Tech Ltd. https://www.kite.ly
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The software MAY ONLY be used with the Kite Tech Ltd platform and MAY NOT be modified
 * to be used with any competitor platforms. This means the software MAY NOT be modified 
 * to place orders with any competitors to Kite Tech Ltd, all orders MUST go through the
 * Kite Tech Ltd platform servers. 
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 *****************************************************/

///// Package Declaration /////

package ly.kite.product.journey;


///// Import(s) /////

import android.app.Activity;
import android.app.Fragment;

import ly.kite.product.AKiteActivity;


///// Class Declaration /////

/*****************************************************
 *
 * This is the parent class of user journey fragments.
 *
 *****************************************************/
abstract public class AJourneyFragment extends Fragment
  {
  ////////// Static Constant(s) //////////

  @SuppressWarnings( "unused" )
  public  static final String  TAG                             = "AJourneyFragment";

  public  static final long    MAX_ACCEPTED_PRODUCT_AGE_MILLIS = 1000 * 60 * 60;  // 1 hour


  ////////// Static Variable(s) //////////


  ////////// Member Variable(s) //////////

  protected AKiteActivity  mKiteActivity;
  protected boolean        mIsVisible;


  ////////// Static Initialiser(s) //////////


  ////////// Static Method(s) //////////


  ////////// Constructor(s) //////////


  ////////// Fragment Method(s) //////////

  /*****************************************************
   *
   * Called when the fragment is attached to an activity.
   *
   *****************************************************/
  @Override
  public void onAttach( Activity activity )
    {
    super.onAttach( activity );

    mKiteActivity = (AKiteActivity)activity;
    }


  /*****************************************************
   *
   * Called when the fragment becomes visible.
   *
   *****************************************************/
  @Override
  public void onStart()
    {
    super.onStart();

    mIsVisible = true;
    }


  /*****************************************************
   *
   * Called after the fragment is no longer visible.
   *
   *****************************************************/
  @Override
  public void onStop()
    {
    super.onStop();

    mIsVisible = false;
    }


  ////////// Method(s) //////////

  /*****************************************************
   *
   * Called when the back key is pressed. The fragment
   * can either intercept it, or ignore it - in which case
   * the default behaviour is performed.
   *
   *****************************************************/
  public boolean onBackPressIntercepted()
    {
    return ( false );
    }


  ////////// Inner Class(es) //////////

  /*****************************************************
   *
   * ...
   *
   *****************************************************/

  }

