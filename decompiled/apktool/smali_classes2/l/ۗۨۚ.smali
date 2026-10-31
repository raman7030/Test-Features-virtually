.class public final Ll/ۗۨۚ;
.super Ljava/lang/Object;
.source "57D5"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ۗ:Ll/ܺۤۚ;

.field public ۙ:S

.field public ۬:S

.field public final ᩶:S

.field public ᩸:Ll/ܺۤۚ;

.field public ᩹:Ll/᩻ۨۚ;


# direct methods
.method public constructor <init>(SSLl/ܺۤۚ;Ll/ܺۤۚ;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-short p1, p0, Ll/ۗۨۚ;->᩶:S

    .line 80
    iput-short p2, p0, Ll/ۗۨۚ;->۬:S

    .line 81
    iput-object p3, p0, Ll/ۗۨۚ;->ۗ:Ll/ܺۤۚ;

    .line 82
    iput-object p4, p0, Ll/ۗۨۚ;->᩸:Ll/ܺۤۚ;

    return-void
.end method

.method public constructor <init>(SSSLl/ܺۤۚ;Ll/ܺۤۚ;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-short p1, p0, Ll/ۗۨۚ;->۬:S

    .line 87
    iput-short p2, p0, Ll/ۗۨۚ;->ۙ:S

    .line 88
    iput-short p3, p0, Ll/ۗۨۚ;->᩶:S

    .line 89
    iput-object p4, p0, Ll/ۗۨۚ;->ۗ:Ll/ܺۤۚ;

    .line 90
    iput-object p5, p0, Ll/ۗۨۚ;->᩸:Ll/ܺۤۚ;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public final ֫()Ll/᩻ۨۚ;
    .locals 2

    .line 94
    iget-object v0, p0, Ll/ۗۨۚ;->᩹:Ll/᩻ۨۚ;

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Ll/ۗۨۚ;->᩸:Ll/ܺۤۚ;

    iget-object v0, v0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iget-object v0, v0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/᩻ۨۚ;->֫(C)Ll/᩻ۨۚ;

    move-result-object v0

    iput-object v0, p0, Ll/ۗۨۚ;->᩹:Ll/᩻ۨۚ;

    .line 97
    :cond_0
    iget-object v0, p0, Ll/ۗۨۚ;->᩹:Ll/᩻ۨۚ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 131
    iget-short v0, p0, Ll/ۗۨۚ;->۬:S

    sub-int/2addr p1, v0

    int-to-short p1, p1

    iput-short p1, p0, Ll/ۗۨۚ;->ۙ:S

    return-void
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 136
    check-cast p1, Ll/ۛ۫ۚ;

    iget-short v0, p0, Ll/ۗۨۚ;->۬:S

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 137
    iget-short v0, p0, Ll/ۗۨۚ;->ۙ:S

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 138
    iget-object v0, p0, Ll/ۗۨۚ;->ۗ:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 139
    iget-object v0, p0, Ll/ۗۨۚ;->᩸:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 140
    iget-short v0, p0, Ll/ۗۨۚ;->᩶:S

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()S
    .locals 1

    .line 122
    iget-short v0, p0, Ll/ۗۨۚ;->᩶:S

    return v0
.end method
