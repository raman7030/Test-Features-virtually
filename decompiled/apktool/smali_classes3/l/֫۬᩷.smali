.class public Ll/֫۬᩷;
.super Ll/ۘۙ᩷;
.source "X6MV"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 3

    .line 33
    new-instance v0, Ll/۟ۗ᩷;

    invoke-direct {v0, p0, p1}, Ll/۟ۗ᩷;-><init>(Ll/֫۬᩷;Ll/ۗܺ᩷;)V

    .line 58
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ۧ(Ljava/lang/CharSequence;)V

    .line 59
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    const v2, 0x2faf080

    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 60
    invoke-virtual {v0}, Ll/۬ۗܿ;->֫()V

    const/4 p1, 0x2

    .line 61
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ܿ(I)V

    const/4 p1, 0x6

    .line 62
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ᩳ(I)V

    const/16 p1, 0xa

    .line 63
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ܳ(I)V

    .line 64
    invoke-virtual {v0}, Ll/۬ۗܿ;->֡()V

    const/4 p1, 0x1

    .line 205
    invoke-virtual {v0, p1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method
