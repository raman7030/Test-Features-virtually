.class public final Ll/᩶ۨۚ;
.super Ljava/lang/Object;
.source "87EI"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ᩸:J

.field public ᩹:I


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput p1, p0, Ll/᩶ۨۚ;->᩹:I

    .line 45
    iput-wide p2, p0, Ll/᩶ۨۚ;->᩸:J

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 55
    check-cast p1, Ll/ۛ۫ۚ;

    iget v0, p0, Ll/᩶ۨۚ;->᩹:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 56
    iget-wide v0, p0, Ll/᩶ۨۚ;->᩸:J

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
