/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTetrahedronShapeEx extends btBU_Simplex1to4 {
	private long swigCPtr;
	
	protected btTetrahedronShapeEx(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btTetrahedronShapeEx_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTetrahedronShapeEx, normally you should not need this constructor it's intended for low-level usage. */
	public btTetrahedronShapeEx(long cPtr, boolean cMemoryOwn) {
		this("btTetrahedronShapeEx", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btTetrahedronShapeEx_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTetrahedronShapeEx obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btTetrahedronShapeEx(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btTetrahedronShapeEx() {
    this(CollisionJNI.new_btTetrahedronShapeEx(), true);
  }

  public void setVertices(Vector3 v0, Vector3 v1, Vector3 v2, Vector3 v3) {
    CollisionJNI.btTetrahedronShapeEx_setVertices(swigCPtr, this, v0, v1, v2, v3);
  }

}
