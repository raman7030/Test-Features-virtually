.class public interface abstract annotation Lnet/engio/mbassy/listener/Handler;
.super Ljava/lang/Object;
.source "Handler.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lnet/engio/mbassy/listener/Handler;
        condition = ""
        delivery = .enum Lnet/engio/mbassy/listener/Invoke;->Synchronously:Lnet/engio/mbassy/listener/Invoke;
        enabled = true
        filters = {}
        invocation = Lnet/engio/mbassy/dispatch/ReflectiveHandlerInvocation;
        priority = 0x0
        rejectSubtypes = false
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Inherited;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract condition()Ljava/lang/String;
.end method

.method public abstract delivery()Lnet/engio/mbassy/listener/Invoke;
.end method

.method public abstract enabled()Z
.end method

.method public abstract filters()[Lnet/engio/mbassy/listener/Filter;
.end method

.method public abstract invocation()Ljava/lang/Class;
.end method

.method public abstract priority()I
.end method

.method public abstract rejectSubtypes()Z
.end method
