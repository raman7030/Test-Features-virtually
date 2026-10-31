.class public final synthetic Ll/֡᩻ᩳ;
.super Ljava/lang/Object;
.source "K5R1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۜۜᩳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۜۜᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iput p2, p0, Ll/֡᩻ᩳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 341
    iget-object p1, p0, Ll/֡᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object p2, p2, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    iget v0, p0, Ll/֡᩻ᩳ;->᩹:I

    invoke-virtual {p2, v0}, Ll/ᩴܿܽ;->᩵(I)V

    .line 342
    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    const/4 v0, 0x0

    iput-object v0, p2, Ll/᩻ۜᩳ;->ۨ:Ll/ۙܿܽ;

    .line 343
    iget-object p2, p1, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {p2}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    .line 344
    iget-object p1, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    const/4 p2, 0x1

    iput-boolean p2, p1, Ll/᩻ۜᩳ;->᩺:Z

    return-void
.end method
