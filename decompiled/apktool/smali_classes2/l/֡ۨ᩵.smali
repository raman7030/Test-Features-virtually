.class public final Ll/֡ۨ᩵;
.super Ljava/lang/Object;
.source "A8DI"


# instance fields
.field public final ֫:Ll/ۚۨ᩵;


# direct methods
.method public constructor <init>(Ll/ۚۨ᩵;)V
    .locals 0

    .line 392
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 393
    iput-object p1, p0, Ll/֡ۨ᩵;->֫:Ll/ۚۨ᩵;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۚۨ᩵;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֡ۨ᩵;-><init>(Ll/ۚۨ᩵;)V

    return-void
.end method

.method public static ֫(B)Ll/֡ۨ᩵;
    .locals 1

    ushr-int/lit8 v0, p0, 0x4

    and-int/lit8 v0, v0, 0x7

    and-int/lit16 p0, p0, 0x8f

    if-gtz p0, :cond_0

    .line 402
    new-instance p0, Ll/֡ۨ᩵;

    invoke-static {v0}, Ll/ۚۨ᩵;->֫(I)Ll/ۚۨ᩵;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/֡ۨ᩵;-><init>(Ll/ۚۨ᩵;)V

    return-object p0

    .line 399
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Reserved fields must be 0"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 407
    iget-object v0, p0, Ll/֡ۨ᩵;->֫:Ll/ۚۨ᩵;

    invoke-virtual {v0}, Ll/ۚۨ᩵;->֫()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x1

    shl-int v0, v1, v0

    return v0
.end method

.method public final ۧ()B
    .locals 1

    .line 411
    iget-object v0, p0, Ll/֡ۨ᩵;->֫:Ll/ۚۨ᩵;

    invoke-virtual {v0}, Ll/ۚۨ᩵;->֫()I

    move-result v0

    and-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x4

    int-to-byte v0, v0

    return v0
.end method
