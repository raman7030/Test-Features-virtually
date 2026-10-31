.class public final Ll/ۢܿܺ;
.super Ljava/lang/Object;
.source "GBA8"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/io/PrintStream;

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xd

    .line 45
    iput v0, p0, Ll/ۢܿܺ;->ܽ:I

    const/4 v0, 0x0

    .line 55
    iput-boolean v0, p0, Ll/ۢܿܺ;->֫:Z

    .line 63
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    iput-object v0, p0, Ll/ۢܿܺ;->ۧ:Ljava/io/PrintStream;

    return-void
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 1

    .line 88
    iget v0, p0, Ll/ۢܿܺ;->ܽ:I

    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
