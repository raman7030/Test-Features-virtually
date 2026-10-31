.class public interface abstract annotation Lnet/engio/mbassy/listener/Listener;
.super Ljava/lang/Object;
.source "Listener.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lnet/engio/mbassy/listener/Listener;
        references = .enum Lnet/engio/mbassy/listener/References;->Weak:Lnet/engio/mbassy/listener/References;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Inherited;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract references()Lnet/engio/mbassy/listener/References;
.end method
