.class public final Lnet/engio/mbassy/listener/MetadataReader$1;
.super Ljava/lang/Object;
.source "MetadataReader.java"

# interfaces
.implements Lnet/engio/mbassy/common/IPredicate;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Z
    .locals 0

    .line 24
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p0, p1}, Lnet/engio/mbassy/listener/MetadataReader$1;->apply(Ljava/lang/reflect/Method;)Z

    move-result p1

    return p1
.end method

.method public apply(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 27
    const-class v0, Lnet/engio/mbassy/listener/Handler;

    invoke-static {p1, v0}, Lnet/engio/mbassy/common/ReflectionUtils;->getAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
