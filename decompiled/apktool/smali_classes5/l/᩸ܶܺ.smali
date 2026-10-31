.class public final Ll/᩸ܶܺ;
.super Ll/᩶ܶܺ;
.source "O3OZ"


# instance fields
.field public final synthetic ۤ:Ll/ܳܶܺ;


# direct methods
.method public constructor <init>(Ll/ۗܶܺ;Ljava/lang/CharSequence;Ll/ܳܶܺ;)V
    .locals 0

    .line 222
    iput-object p3, p0, Ll/᩸ܶܺ;->ۤ:Ll/ܳܶܺ;

    invoke-direct {p0, p1, p2}, Ll/᩶ܶܺ;-><init>(Ll/ۗܶܺ;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final ۧ(I)I
    .locals 0

    .line 230
    iget-object p1, p0, Ll/᩸ܶܺ;->ۤ:Ll/ܳܶܺ;

    .line 81
    iget-object p1, p1, Ll/ܳܶܺ;->֫:Ljava/util/regex/Matcher;

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->end()I

    move-result p1

    return p1
.end method

.method public final ܽ(I)I
    .locals 1

    .line 225
    iget-object v0, p0, Ll/᩸ܶܺ;->ۤ:Ll/ܳܶܺ;

    .line 71
    iget-object v0, v0, Ll/ܳܶܺ;->֫:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 86
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
