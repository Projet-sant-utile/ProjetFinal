package com.inti.interfaces;

import java.io.Serializable;

public interface IHasId<I> extends Serializable
{
	public I getId();

	public void setId(I i);
}
