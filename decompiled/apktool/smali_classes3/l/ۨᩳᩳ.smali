.class public interface abstract annotation Ll/ۨᩳᩳ;
.super Ljava/lang/Object;
.source "DB98"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Ll/ۨᩳᩳ;
        cls = .enum Ll/ܰᩳᩳ;->᩶:Ll/ܰᩳᩳ;
        elementType = .enum Ll/֫ܿᩳ;->᩹:Ll/֫ܿᩳ;
        index = 0x0
        listElementType = Ljava/lang/Object;
        optional = false
        tagNumber = -0x1
        tagging = .enum Ll/۟ᩳᩳ;->ۙ:Ll/۟ᩳᩳ;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract cls()Ll/ܰᩳᩳ;
.end method

.method public abstract elementType()Ll/֫ܿᩳ;
.end method

.method public abstract index()I
.end method

.method public abstract listElementType()Ljava/lang/Class;
.end method

.method public abstract optional()Z
.end method

.method public abstract tagNumber()I
.end method

.method public abstract tagging()Ll/۟ᩳᩳ;
.end method

.method public abstract type()Ll/֫ܿᩳ;
.end method
