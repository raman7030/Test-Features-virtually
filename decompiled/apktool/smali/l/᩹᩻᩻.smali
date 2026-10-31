.class public final synthetic Ll/᩹᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/֡᩻᩻;

.field public final synthetic ۧ:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/֡᩻᩻;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹᩻᩻;->֫:Ll/֡᩻᩻;

    iput-object p2, p0, Ll/᩹᩻᩻;->ۧ:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 230
    iget-object v0, p0, Ll/᩹᩻᩻;->֫:Ll/֡᩻᩻;

    iput-object p1, v0, Ll/֡᩻᩻;->֫:Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    .line 231
    iget-object p1, p0, Ll/᩹᩻᩻;->ۧ:Ll/ۗܺ᩷;

    const v2, 0x7f120470

    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 300
    iget-object v0, v0, Ll/֡᩻᩻;->ܽ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
