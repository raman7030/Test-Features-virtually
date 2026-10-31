.class public final Ll/ܿ᩹ܿ;
.super Ljava/lang/Object;
.source "V176"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:I

.field public final ۛ:I

.field public final ۤ:J

.field public final ۫:J

.field public final ۬:J

.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIIJJJLjava/lang/String;I)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ll/ܿ᩹ܿ;->ۗ:Ljava/lang/String;

    .line 26
    iput p2, p0, Ll/ܿ᩹ܿ;->ۙ:I

    .line 27
    iput p3, p0, Ll/ܿ᩹ܿ;->ۛ:I

    .line 28
    iput p4, p0, Ll/ܿ᩹ܿ;->᩸:I

    .line 29
    iput-wide p5, p0, Ll/ܿ᩹ܿ;->ۤ:J

    .line 30
    iput-wide p7, p0, Ll/ܿ᩹ܿ;->۫:J

    .line 31
    iput-wide p9, p0, Ll/ܿ᩹ܿ;->۬:J

    .line 32
    iput-object p11, p0, Ll/ܿ᩹ܿ;->᩹:Ljava/lang/String;

    .line 33
    iput p12, p0, Ll/ܿ᩹ܿ;->᩶:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 62
    iget v0, p0, Ll/ܿ᩹ܿ;->᩸:I

    return v0
.end method

.method public final ۜ()J
    .locals 2

    .line 77
    iget-wide v0, p0, Ll/ܿ᩹ܿ;->۬:J

    return-wide v0
.end method

.method public final ۡ()I
    .locals 1

    .line 58
    iget v0, p0, Ll/ܿ᩹ܿ;->ۛ:I

    return v0
.end method

.method public final ۢ()J
    .locals 2

    .line 66
    iget-wide v0, p0, Ll/ܿ᩹ܿ;->ۤ:J

    return-wide v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܿ᩹ܿ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ܿ᩹ܿ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()C
    .locals 1

    .line 88
    iget v0, p0, Ll/ܿ᩹ܿ;->᩶:I

    invoke-static {v0}, Ll/ۧ۠᩵;->֫(I)C

    move-result v0

    return v0
.end method

.method public final ܿ()C
    .locals 1

    .line 45
    iget v0, p0, Ll/ܿ᩹ܿ;->ۙ:I

    invoke-static {v0}, Ll/ۧ۠᩵;->֫(I)C

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 41
    iget v0, p0, Ll/ܿ᩹ܿ;->ۙ:I

    return v0
.end method

.method public final ᩷()J
    .locals 2

    .line 70
    iget-wide v0, p0, Ll/ܿ᩹ܿ;->۫:J

    return-wide v0
.end method

.method public final ᩻()I
    .locals 1

    .line 54
    iget v0, p0, Ll/ܿ᩹ܿ;->ۙ:I

    and-int/lit16 v0, v0, 0xfff

    return v0
.end method
