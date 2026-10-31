.class public interface abstract annotation Ll/۫۟ۡ;
.super Ljava/lang/Object;
.source "EAVL"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Ll/۫۟ۡ;
        alphabetic = true
        asm = true
        ignores = {}
        mappingTo = Ljava/lang/Void;
        naming = .enum Ll/ۙ۟ۡ;->᩹:Ll/ۙ۟ۡ;
        orders = {}
        parseFeatures = {}
        seeAlso = {}
        serialzeFeatures = {}
        typeKey = ""
        typeName = ""
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract ignores()[Ljava/lang/String;
.end method

.method public abstract mappingTo()Ljava/lang/Class;
.end method

.method public abstract naming()Ll/ۙ۟ۡ;
.end method

.method public abstract orders()[Ljava/lang/String;
.end method

.method public abstract parseFeatures()[Ll/ܰ۟ۡ;
.end method

.method public abstract seeAlso()[Ljava/lang/Class;
.end method

.method public abstract serialzeFeatures()[Ll/᩷ۧܺ;
.end method

.method public abstract typeKey()Ljava/lang/String;
.end method

.method public abstract typeName()Ljava/lang/String;
.end method
