.class public interface abstract Ll/֡֡֫;
.super Ljava/lang/Object;
.source "28SI"


# static fields
.field public static final ֫:Ljava/nio/ByteBuffer;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 129
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    sput-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public abstract flush()V
.end method

.method public abstract reset()V
.end method

.method public abstract ֫(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;
.end method

.method public abstract ֫(Ljava/nio/ByteBuffer;)V
.end method

.method public abstract ۧ()Z
.end method

.method public abstract ܽ()Z
.end method

.method public abstract ܿ()V
.end method

.method public abstract ᩳ()Ljava/nio/ByteBuffer;
.end method
