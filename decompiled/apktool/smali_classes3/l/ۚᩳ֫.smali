.class public final Ll/ۚᩳ֫;
.super Ljava/lang/Object;
.source "RB0P"

# interfaces
.implements Ll/֨ᩳ֫;


# instance fields
.field public final ֫:Ll/᩻ᩳ֫;

.field public ۧ:Ll/ܳܿ֫;


# direct methods
.method public constructor <init>(Ll/ܳܿ֫;Ll/᩻ᩳ֫;)V
    .locals 0

    .line 914
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 915
    iput-object p1, p0, Ll/ۚᩳ֫;->ۧ:Ll/ܳܿ֫;

    .line 916
    iput-object p2, p0, Ll/ۚᩳ֫;->֫:Ll/᩻ᩳ֫;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 938
    iget-object v0, p0, Ll/ۚᩳ֫;->ۧ:Ll/ܳܿ֫;

    return-object v0
.end method

.method public final ֫(Ljava/lang/CharSequence;IILl/֫ܿ֫;)Z
    .locals 3

    .line 922
    invoke-virtual {p4}, Ll/֫ܿ֫;->ۜ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 925
    :cond_0
    iget-object v0, p0, Ll/ۚᩳ֫;->ۧ:Ll/ܳܿ֫;

    if-nez v0, :cond_2

    .line 926
    new-instance v0, Ll/ܳܿ֫;

    .line 927
    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    .line 928
    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    .line 929
    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, Ll/ܳܿ֫;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, Ll/ۚᩳ֫;->ۧ:Ll/ܳܿ֫;

    .line 931
    :cond_2
    iget-object p1, p0, Ll/ۚᩳ֫;->֫:Ll/᩻ᩳ֫;

    check-cast p1, Ll/֫ᩳ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1221
    new-instance p1, Ll/ۧܿ֫;

    .line 53
    invoke-direct {p1, p4}, Ll/᩹ᩳ֫;-><init>(Ll/֫ܿ֫;)V

    .line 932
    iget-object p4, p0, Ll/ۚᩳ֫;->ۧ:Ll/ܳܿ֫;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, Ll/ܳܿ֫;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method
