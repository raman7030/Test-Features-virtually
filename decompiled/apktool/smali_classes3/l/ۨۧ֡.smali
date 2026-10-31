.class public final Ll/ۨۧ֡;
.super Ljava/lang/Object;
.source "44EI"


# instance fields
.field public final ֫:[Ll/ۨۧ֡;

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [Ll/ۨۧ֡;

    .line 209
    iput-object v0, p0, Ll/ۨۧ֡;->֫:[Ll/ۨۧ֡;

    const/4 v0, 0x0

    .line 210
    iput v0, p0, Ll/ۨۧ֡;->ۧ:I

    .line 211
    iput v0, p0, Ll/ۨۧ֡;->ܽ:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 221
    iput-object v0, p0, Ll/ۨۧ֡;->֫:[Ll/ۨۧ֡;

    .line 222
    iput p1, p0, Ll/ۨۧ֡;->ۧ:I

    and-int/lit8 p1, p2, 0x7

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 224
    :cond_0
    iput p1, p0, Ll/ۨۧ֡;->ܽ:I

    return-void
.end method
