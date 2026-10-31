.class public abstract Ll/֨֡֫;
.super Ljava/lang/Object;
.source "98I4"

# interfaces
.implements Ll/֡֡֫;


# instance fields
.field public ۜ:Ll/ᩴ֡֫;

.field public ۧ:Ljava/nio/ByteBuffer;

.field public ܳ:Ljava/nio/ByteBuffer;

.field public ܽ:Ll/ᩴ֡֫;

.field public ܿ:Ll/ᩴ֡֫;

.field public ᩳ:Z

.field public ᩻:Ll/ᩴ֡֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/֨֡֫;->ۧ:Ljava/nio/ByteBuffer;

    .line 45
    iput-object v0, p0, Ll/֨֡֫;->ܳ:Ljava/nio/ByteBuffer;

    .line 46
    sget-object v0, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    iput-object v0, p0, Ll/֨֡֫;->᩻:Ll/ᩴ֡֫;

    .line 47
    iput-object v0, p0, Ll/֨֡֫;->ۜ:Ll/ᩴ֡֫;

    .line 48
    iput-object v0, p0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    .line 49
    iput-object v0, p0, Ll/֨֡֫;->ܿ:Ll/ᩴ֡֫;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 1

    .line 89
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/֨֡֫;->ܳ:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    .line 90
    iput-boolean v0, p0, Ll/֨֡֫;->ᩳ:Z

    .line 91
    iget-object v0, p0, Ll/֨֡֫;->᩻:Ll/ᩴ֡֫;

    iput-object v0, p0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    .line 92
    iget-object v0, p0, Ll/֨֡֫;->ۜ:Ll/ᩴ֡֫;

    iput-object v0, p0, Ll/֨֡֫;->ܿ:Ll/ᩴ֡֫;

    .line 93
    invoke-virtual {p0}, Ll/֨֡֫;->ܳ()V

    return-void
.end method

.method public final reset()V
    .locals 2

    .line 98
    sget-object v0, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Ll/֨֡֫;->ܳ:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    .line 99
    iput-boolean v1, p0, Ll/֨֡֫;->ᩳ:Z

    .line 100
    iput-object v0, p0, Ll/֨֡֫;->ۧ:Ljava/nio/ByteBuffer;

    .line 101
    sget-object v0, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    iput-object v0, p0, Ll/֨֡֫;->᩻:Ll/ᩴ֡֫;

    .line 102
    iput-object v0, p0, Ll/֨֡֫;->ۜ:Ll/ᩴ֡֫;

    .line 103
    iput-object v0, p0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    .line 104
    iput-object v0, p0, Ll/֨֡֫;->ܿ:Ll/ᩴ֡֫;

    .line 105
    invoke-virtual {p0}, Ll/֨֡֫;->ۜ()V

    return-void
.end method

.method public final ֫(I)Ljava/nio/ByteBuffer;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/֨֡֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-ge v0, p1, :cond_0

    .line 115
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/֨֡֫;->ۧ:Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 117
    :cond_0
    iget-object p1, p0, Ll/֨֡֫;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 119
    :goto_0
    iget-object p1, p0, Ll/֨֡֫;->ۧ:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Ll/֨֡֫;->ܳ:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public final ֫(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;
    .locals 0

    .line 55
    iput-object p1, p0, Ll/֨֡֫;->᩻:Ll/ᩴ֡֫;

    .line 56
    invoke-virtual {p0, p1}, Ll/֨֡֫;->ۧ(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;

    move-result-object p1

    iput-object p1, p0, Ll/֨֡֫;->ۜ:Ll/ᩴ֡֫;

    .line 57
    invoke-virtual {p0}, Ll/֨֡֫;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/֨֡֫;->ۜ:Ll/ᩴ֡֫;

    return-object p1

    :cond_0
    sget-object p1, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    return-object p1
.end method

.method public final ֫()Z
    .locals 1

    .line 125
    iget-object v0, p0, Ll/֨֡֫;->ܳ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    return v0
.end method

.method public ۜ()V
    .locals 0

    return-void
.end method

.method public abstract ۧ(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;
.end method

.method public ۧ()Z
    .locals 2

    .line 84
    iget-boolean v0, p0, Ll/֨֡֫;->ᩳ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֨֡֫;->ܳ:Ljava/nio/ByteBuffer;

    sget-object v1, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ܳ()V
    .locals 0

    return-void
.end method

.method public ܽ()Z
    .locals 2

    .line 63
    iget-object v0, p0, Ll/֨֡֫;->ۜ:Ll/ᩴ֡֫;

    sget-object v1, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 68
    iput-boolean v0, p0, Ll/֨֡֫;->ᩳ:Z

    .line 69
    invoke-virtual {p0}, Ll/֨֡֫;->᩻()V

    return-void
.end method

.method public ᩳ()Ljava/nio/ByteBuffer;
    .locals 2

    .line 75
    iget-object v0, p0, Ll/֨֡֫;->ܳ:Ljava/nio/ByteBuffer;

    .line 76
    sget-object v1, Ll/֡֡֫;->֫:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Ll/֨֡֫;->ܳ:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public ᩻()V
    .locals 0

    return-void
.end method
