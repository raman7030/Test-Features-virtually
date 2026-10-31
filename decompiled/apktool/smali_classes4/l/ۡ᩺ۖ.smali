.class public final Ll/ۡ᩺ۖ;
.super Ll/ܽۨۖ;
.source "R9E5"


# instance fields
.field public ܿ:Ll/ܽۧۘ;


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;Ll/ܽۧۘ;J)V
    .locals 8

    .line 35
    sget-object v3, Ll/᩺ۛۖ;->ܳ֫:Ll/᩺ۛۖ;

    const-wide/16 v6, 0x0

    const/16 v1, 0x9

    move-object v0, p0

    move-object v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v7}, Ll/ܽۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJ)V

    .line 37
    iput-object p2, p0, Ll/ۡ᩺ۖ;->ܿ:Ll/ܽۧۘ;

    return-void
.end method


# virtual methods
.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 2

    .line 42
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 51
    sget-object v0, Ll/᩹ۛۖ;->ۛ:Ll/᩹ۛۖ;

    .line 54
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۖ()V

    const/16 v0, 0x48

    .line 44
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 45
    iget-object v0, p0, Ll/ۡ᩺ۖ;->ܿ:Ll/ܽۧۘ;

    .line 87
    invoke-virtual {v0}, Ll/ܽۧۘ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    .line 106
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    .line 95
    :goto_0
    sget-object v1, Ll/۠ܰۖ;->ۧ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    return-void
.end method
