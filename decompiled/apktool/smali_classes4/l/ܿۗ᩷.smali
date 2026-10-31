.class public final Ll/ܿۗ᩷;
.super Ljava/lang/Object;
.source "B6LU"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/ۤۤᩳ;

.field public final synthetic ᩹:Ll/ܺۡ;


# direct methods
.method public constructor <init>(Ll/ܺۡ;Ll/ۤۤᩳ;)V
    .locals 0

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۗ᩷;->᩹:Ll/ܺۡ;

    iput-object p2, p0, Ll/ܿۗ᩷;->᩸:Ll/ۤۤᩳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 129
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ۗ᩷;->ܽ(Ljava/lang/String;)I

    move-result p1

    .line 130
    iget-object v0, p0, Ll/ܿۗ᩷;->᩹:Ll/ܺۡ;

    add-int/lit8 v1, p1, -0x50

    int-to-float v1, v1

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 131
    iget-object v0, p0, Ll/ܿۗ᩷;->᩸:Ll/ۤۤᩳ;

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(F)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
