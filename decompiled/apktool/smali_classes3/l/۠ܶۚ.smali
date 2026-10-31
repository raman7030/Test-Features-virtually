.class public final Ll/۠ܶۚ;
.super Ljava/lang/Object;
.source "P6MK"

# interfaces
.implements Ll/ۡ᩹ۚ;


# instance fields
.field public final synthetic ۙ:Ll/᩸ܶۚ;

.field public final ᩶:Ll/᩶֡ۚ;

.field public ᩸:Ll/᩶֡ۚ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩸ܶۚ;Ll/᩶֡ۚ;Ll/᩶֡ۚ;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ܶۚ;->ۙ:Ll/᩸ܶۚ;

    const/4 p1, 0x0

    .line 98
    iput p1, p0, Ll/۠ܶۚ;->᩹:I

    .line 103
    iput-object p2, p0, Ll/۠ܶۚ;->᩶:Ll/᩶֡ۚ;

    .line 104
    iput-object p3, p0, Ll/۠ܶۚ;->᩸:Ll/᩶֡ۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ֡ۚ;I)V
    .locals 0

    .line 135
    instance-of p2, p1, Ll/᩶֡ۚ;

    if-eqz p2, :cond_0

    iget-object p2, p0, Ll/۠ܶۚ;->ۙ:Ll/᩸ܶۚ;

    invoke-static {p2}, Ll/᩸ܶۚ;->֫(Ll/᩸ܶۚ;)Ll/۫ܶۚ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ۨ֡ۚ;->ܺ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/۫ܶۚ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 136
    iget-object p1, p0, Ll/۠ܶۚ;->᩸:Ll/᩶֡ۚ;

    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/۠ܶۚ;->᩸:Ll/᩶֡ۚ;

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۨ֡ۚ;I)V
    .locals 3

    .line 108
    instance-of p2, p1, Ll/᩶֡ۚ;

    iget-object v0, p0, Ll/۠ܶۚ;->ۙ:Ll/᩸ܶۚ;

    if-eqz p2, :cond_2

    .line 109
    move-object p2, p1

    check-cast p2, Ll/᩶֡ۚ;

    .line 111
    invoke-static {v0}, Ll/᩸ܶۚ;->֫(Ll/᩸ܶۚ;)Ll/۫ܶۚ;

    move-result-object v1

    invoke-virtual {p2}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۫ܶۚ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 112
    invoke-static {v0, p2}, Ll/᩸ܶۚ;->֫(Ll/᩸ܶۚ;Ll/᩶֡ۚ;)Ll/ܶܶۚ;

    move-result-object p1

    .line 113
    iget-object p2, p1, Ll/ܶܶۚ;->֫:Ll/᩶֡ۚ;

    .line 114
    iget-object v0, p0, Ll/۠ܶۚ;->᩸:Ll/᩶֡ۚ;

    invoke-virtual {v0, p2}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    .line 116
    iget v0, p0, Ll/۠ܶۚ;->᩹:I

    iget p1, p1, Ll/ܶܶۚ;->ۧ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/۠ܶۚ;->᩹:I

    .line 117
    iput-object p2, p0, Ll/۠ܶۚ;->᩸:Ll/᩶֡ۚ;

    return-void

    .line 118
    :cond_0
    iget-object p2, p0, Ll/۠ܶۚ;->᩶:Ll/᩶֡ۚ;

    if-eq p1, p2, :cond_1

    .line 119
    iget p1, p0, Ll/۠ܶۚ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۠ܶۚ;->᩹:I

    :cond_1
    return-void

    .line 121
    :cond_2
    instance-of p2, p1, Ll/ۧۚۚ;

    if-eqz p2, :cond_3

    .line 122
    check-cast p1, Ll/ۧۚۚ;

    .line 123
    new-instance p2, Ll/ۧۚۚ;

    invoke-virtual {p1}, Ll/ۤ֡ۚ;->۫()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۧۚۚ;-><init>(Ljava/lang/String;)V

    .line 124
    iget-object p1, p0, Ll/۠ܶۚ;->᩸:Ll/᩶֡ۚ;

    invoke-virtual {p1, p2}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    return-void

    .line 125
    :cond_3
    instance-of p2, p1, Ll/ᩴ֡ۚ;

    if-eqz p2, :cond_4

    invoke-static {v0}, Ll/᩸ܶۚ;->֫(Ll/᩸ܶۚ;)Ll/۫ܶۚ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ۨ֡ۚ;->᩵()Ll/ۨ֡ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨ֡ۚ;->ܺ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/۫ܶۚ;->ۧ(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 126
    check-cast p1, Ll/ᩴ֡ۚ;

    .line 127
    new-instance p2, Ll/ᩴ֡ۚ;

    invoke-virtual {p1}, Ll/ۤ֡ۚ;->ۗ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ᩴ֡ۚ;-><init>(Ljava/lang/String;)V

    .line 128
    iget-object p1, p0, Ll/۠ܶۚ;->᩸:Ll/᩶֡ۚ;

    invoke-virtual {p1, p2}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    return-void

    .line 130
    :cond_4
    iget p1, p0, Ll/۠ܶۚ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۠ܶۚ;->᩹:I

    return-void
.end method
