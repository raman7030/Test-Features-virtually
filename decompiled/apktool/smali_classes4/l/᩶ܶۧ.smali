.class public final Ll/᩶ܶۧ;
.super Ljava/lang/Object;
.source "956H"

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# instance fields
.field public final synthetic ֫:Ll/ۙܶۧ;


# direct methods
.method public constructor <init>(Ll/ۙܶۧ;)V
    .locals 0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܶۧ;->֫:Ll/ۙܶۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;IZ)V
    .locals 2

    .line 122
    iget-object p1, p0, Ll/᩶ܶۧ;->֫:Ll/ۙܶۧ;

    iget-object v0, p1, Ll/ۙܶۧ;->᩺:Ljava/util/HashSet;

    if-eqz p3, :cond_0

    .line 123
    iget-boolean p3, p1, Ll/ۙܶۧ;->ܰ:Z

    iget-object v1, p1, Ll/ۙܶۧ;->ۨ:[Ljava/lang/CharSequence;

    aget-object p2, v1, p2

    .line 124
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 123
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p2, p3

    iput-boolean p2, p1, Ll/ۙܶۧ;->ܰ:Z

    return-void

    .line 126
    :cond_0
    iget-boolean p3, p1, Ll/ۙܶۧ;->ܰ:Z

    iget-object v1, p1, Ll/ۙܶۧ;->ۨ:[Ljava/lang/CharSequence;

    aget-object p2, v1, p2

    .line 127
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 126
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p2, p3

    iput-boolean p2, p1, Ll/ۙܶۧ;->ܰ:Z

    return-void
.end method
