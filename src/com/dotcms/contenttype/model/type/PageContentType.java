package com.dotcms.contenttype.model.type;

import org.immutables.value.Value;

@Value.Immutable
public abstract class PageContentType extends ContentType{



	private static final long serialVersionUID = 1L;

	@Override
	public  BaseContentTypes baseType() {
		return  BaseContentTypes.HTMLPAGE;
	}
	public abstract static class Builder implements ContentTypeBuilder {}

}
