.class public final synthetic Ll/۟ܶ᩻;
.super Ljava/lang/Object;
.source "V8F2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:Landroid/widget/TextView;

.field public final synthetic ᩸:Landroid/widget/TextView;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;ILandroid/widget/TextView;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ܶ᩻;->᩸:Landroid/widget/TextView;

    iput p2, p0, Ll/۟ܶ᩻;->᩹:I

    iput-object p3, p0, Ll/۟ܶ᩻;->᩶:Landroid/widget/TextView;

    iput p4, p0, Ll/۟ܶ᩻;->ۙ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 176
    iget v0, p0, Ll/۟ܶ᩻;->᩹:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۟ܶ᩻;->᩸:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    iget v0, p0, Ll/۟ܶ᩻;->ۙ:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۟ܶ᩻;->᩶:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
