.class public final synthetic Ll/᩸᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/֡᩻᩻;

.field public final synthetic ۙ:Ll/֡᩻᩻;

.field public final synthetic ۬:Ll/֡᩻᩻;

.field public final synthetic ᩶:Ll/֡᩻᩻;

.field public final synthetic ᩸:Ll/ۙ᩻᩻;

.field public final synthetic ᩹:Ll/֡᩻᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;Ll/֡᩻᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩻᩻;->᩸:Ll/ۙ᩻᩻;

    iput-object p2, p0, Ll/᩸᩻᩻;->᩹:Ll/֡᩻᩻;

    iput-object p3, p0, Ll/᩸᩻᩻;->᩶:Ll/֡᩻᩻;

    iput-object p4, p0, Ll/᩸᩻᩻;->ۙ:Ll/֡᩻᩻;

    iput-object p5, p0, Ll/᩸᩻᩻;->ۗ:Ll/֡᩻᩻;

    iput-object p6, p0, Ll/᩸᩻᩻;->۬:Ll/֡᩻᩻;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    iget-object p1, p0, Ll/᩸᩻᩻;->᩸:Ll/ۙ᩻᩻;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    iget-object p2, p0, Ll/᩸᩻᩻;->᩹:Ll/֡᩻᩻;

    iget-object p2, p2, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    .line 244
    iput-boolean p2, p1, Ll/ۗ᩻᩻;->᩸:Z

    .line 280
    iget-object p2, p0, Ll/᩸᩻᩻;->᩶:Ll/֡᩻᩻;

    iget-object p2, p2, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    .line 245
    iput-boolean p2, p1, Ll/ۗ᩻᩻;->۫:Z

    .line 280
    iget-object p2, p0, Ll/᩸᩻᩻;->ۙ:Ll/֡᩻᩻;

    iget-object p2, p2, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    .line 246
    iput-boolean p2, p1, Ll/ۗ᩻᩻;->ۨ:Z

    .line 247
    iget-object p2, p0, Ll/᩸᩻᩻;->ۗ:Ll/֡᩻᩻;

    iget-object p2, p2, Ll/֡᩻᩻;->֫:Ljava/lang/Object;

    if-eqz p2, :cond_0

    .line 248
    check-cast p2, Ljava/lang/String;

    iput-object p2, p1, Ll/ۗ᩻᩻;->ۙ:Ljava/lang/String;

    .line 249
    invoke-static {p2}, Ll/ۗ᩻᩻;->֫(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p1, Ll/ۗ᩻᩻;->ۗ:J

    .line 251
    :cond_0
    iget-object p2, p0, Ll/᩸᩻᩻;->۬:Ll/֡᩻᩻;

    iget-object p2, p2, Ll/֡᩻᩻;->֫:Ljava/lang/Object;

    if-eqz p2, :cond_1

    .line 252
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p1, Ll/ۗ᩻᩻;->ۤ:I

    :cond_1
    return-void
.end method
