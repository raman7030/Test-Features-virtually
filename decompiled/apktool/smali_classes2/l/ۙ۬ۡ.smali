.class public final Ll/ۙ۬ۡ;
.super Ljava/lang/Object;
.source "Y91P"

# interfaces
.implements Landroid/text/InputFilter;


# static fields
.field public static final ᩸:Landroid/text/InputFilter;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/text/InputFilter$AllCaps;

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {}, Ll/᩹۬ۡ;->֫()Landroid/text/InputFilter$AllCaps;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ll/ۙ۬ۡ;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    :goto_0
    sput-object v0, Ll/ۙ۬ۡ;->᩸:Landroid/text/InputFilter;

    return-void
.end method


# virtual methods
.method public final filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 0

    move p4, p2

    :goto_0
    if-ge p4, p3, :cond_2

    .line 21
    invoke-interface {p1, p4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p5

    .line 22
    invoke-static {p5}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result p5

    if-eqz p5, :cond_1

    .line 30
    instance-of p4, p1, Landroid/text/Spanned;

    if-eqz p4, :cond_0

    .line 31
    new-instance p4, Ll/᩶۬ۡ;

    check-cast p1, Landroid/text/Spanned;

    invoke-direct {p4, p1, p2, p3}, Ll/᩶۬ۡ;-><init>(Landroid/text/Spanned;II)V

    return-object p4

    .line 33
    :cond_0
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method
