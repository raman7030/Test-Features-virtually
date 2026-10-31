.class public final Ll/᩶ۧܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ll/᩵ܽܳ;


# instance fields
.field public final ᩸:I

.field public final ᩹:B


# direct methods
.method public constructor <init>(BI)V
    .locals 0

    .line 6600
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6601
    iput p2, p0, Ll/᩶ۧܳ;->᩸:I

    .line 6602
    iput-byte p1, p0, Ll/᩶ۧܳ;->᩹:B

    return-void
.end method


# virtual methods
.method public final synthetic close()V
    .locals 0

    return-void
.end method

.method public final length()I
    .locals 1

    .line 6607
    iget v0, p0, Ll/᩶ۧܳ;->᩸:I

    return v0
.end method

.method public final ֫(I[BII)V
    .locals 1

    .line 6612
    iget v0, p0, Ll/᩶ۧܳ;->᩸:I

    invoke-static {v0, p1, p4}, Ll/ۡܽܳ;->ܽ(III)V

    .line 6613
    array-length p1, p2

    invoke-static {p1, p3, p4}, Ll/ۡܽܳ;->ۧ(III)V

    add-int/2addr p4, p3

    .line 6614
    iget-byte p1, p0, Ll/᩶ۧܳ;->᩹:B

    invoke-static {p2, p3, p4, p1}, Ljava/util/Arrays;->fill([BIIB)V

    return-void
.end method

.method public final synthetic ۫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩺ۧ()Ll/ᩴܽܳ;
    .locals 0

    return-object p0
.end method
