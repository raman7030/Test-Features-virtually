.class public final synthetic Ll/ۡ᩶᩷;
.super Ljava/lang/Object;
.source "892H"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܺ᩶᩷;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ܺ᩶᩷;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩶᩷;->᩸:Ll/ܺ᩶᩷;

    iput p2, p0, Ll/ۡ᩶᩷;->᩹:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 113
    iget-object p1, p0, Ll/ۡ᩶᩷;->᩸:Ll/ܺ᩶᩷;

    iget-object p1, p1, Ll/ܺ᩶᩷;->᩶:Ll/ۖ᩶᩷;

    iget-object p2, p1, Ll/ۖ᩶᩷;->ۧ:Ljava/util/ArrayList;

    iget v0, p0, Ll/ۡ᩶᩷;->᩹:I

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘ᩶᩷;

    invoke-virtual {p2}, Ll/ۘ᩶᩷;->ܽ()Ljava/lang/String;

    move-result-object p2

    .line 114
    invoke-static {p1}, Ll/ۖ᩶᩷;->֫(Ll/ۖ᩶᩷;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܽۗ;->֫(Ll/ۗܺ᩷;Ljava/util/List;)V

    .line 115
    invoke-static {p2}, Lbin/mt/plus/ShortcutActivity;->ܽ(Ljava/lang/String;)V

    .line 116
    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method
