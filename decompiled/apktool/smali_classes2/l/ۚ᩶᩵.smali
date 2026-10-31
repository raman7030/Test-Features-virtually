.class public Ll/ۚ᩶᩵;
.super Ljava/lang/Object;
.source "NAX7"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:C

.field public final ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 37
    invoke-static {v0, v1, v0}, Ll/᩻ۙ۠;->֫(III)I

    move-result v1

    int-to-char v1, v1

    iput-char v1, p0, Ll/ۚ᩶᩵;->᩸:C

    .line 42
    iput v0, p0, Ll/ۚ᩶᩵;->᩹:I

    return-void
.end method


# virtual methods
.method public final getLast()C
    .locals 1

    .line 37
    iget-char v0, p0, Ll/ۚ᩶᩵;->᩸:C

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 44
    new-instance v0, Ll/֨᩶᩵;

    iget-char v1, p0, Ll/ۚ᩶᩵;->᩸:C

    iget v2, p0, Ll/ۚ᩶᩵;->᩹:I

    invoke-direct {v0, v1, v2}, Ll/֨᩶᩵;-><init>(CI)V

    return-object v0
.end method
