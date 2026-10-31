.class public final synthetic Ll/ۛ֫᩻;
.super Ljava/lang/Object;
.source "65FC"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/ܽۜܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ֫᩻;->֫:Ll/ܽۜܳ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/ۧ۠ܳ;

    .line 319
    invoke-virtual {p1}, Ll/ۧ۠ܳ;->ܳ()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Ll/ۛ֫᩻;->֫:Ll/ܽۜܳ;

    invoke-virtual {v1}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 320
    invoke-virtual {p1}, Ll/ۧ۠ܳ;->ܿ()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {v1}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
