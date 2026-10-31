.class public final synthetic Ll/᩺֫᩻;
.super Ljava/lang/Object;
.source "65FC"

# interfaces
.implements Ll/ܽ۠ܳ;


# instance fields
.field public final synthetic ᩸:Ll/ܽۜܳ;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۜܳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺֫᩻;->᩸:Ll/ܽۜܳ;

    iput-object p2, p0, Ll/᩺֫᩻;->᩹:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 2

    .line 107
    iget-object v0, p0, Ll/᩺֫᩻;->᩸:Ll/ܽۜܳ;

    invoke-virtual {v0}, Ll/ܽۜܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    invoke-virtual {v0}, Ll/ܽۜܳ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object p1, p0, Ll/᩺֫᩻;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
