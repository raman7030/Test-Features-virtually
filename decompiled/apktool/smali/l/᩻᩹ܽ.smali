.class public final synthetic Ll/᩻᩹ܽ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۧ᩸֡;


# direct methods
.method public synthetic constructor <init>(Ll/ۧ᩸֡;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻᩹ܽ;->᩸:Ll/ۧ᩸֡;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    sget-boolean p1, Ll/᩷᩶ܽ;->ܺۧ:Z

    .line 1127
    iget-object p1, p0, Ll/᩻᩹ܽ;->᩸:Ll/ۧ᩸֡;

    invoke-virtual {p1}, Ll/ۧ᩸֡;->᩷()Ll/᩺ۙ֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
