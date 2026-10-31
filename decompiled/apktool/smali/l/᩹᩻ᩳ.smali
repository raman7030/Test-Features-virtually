.class public final synthetic Ll/᩹᩻ᩳ;
.super Ljava/lang/Object;
.source "K5R1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/᩶ܿܽ;

.field public final synthetic ᩸:Ll/ۜۜᩳ;

.field public final synthetic ᩹:[Z


# direct methods
.method public synthetic constructor <init>(Ll/ۜۜᩳ;[ZLl/᩶ܿܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iput-object p2, p0, Ll/᩹᩻ᩳ;->᩹:[Z

    iput-object p3, p0, Ll/᩹᩻ᩳ;->᩶:Ll/᩶ܿܽ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 2
    sget p1, Ll/ۜۜᩳ;->᩷ۧ:I

    .line 4
    iget-object p1, p0, Ll/᩹᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    iget-object p2, p0, Ll/᩹᩻ᩳ;->᩹:[Z

    array-length v0, p2

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    :goto_0
    if-ltz v0, :cond_1

    .line 898
    aget-boolean v3, p2, v0

    if-eqz v3, :cond_0

    .line 900
    iget-object v2, p0, Ll/᩹᩻ᩳ;->᩶:Ll/᩶ܿܽ;

    invoke-virtual {v2, v0}, Ll/᩶ܿܽ;->᩻(I)V

    const/4 v2, 0x1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    .line 904
    iget-object p2, p1, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {p2}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    .line 905
    iget-object p1, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-boolean v1, p1, Ll/᩻ۜᩳ;->᩺:Z

    :cond_2
    return-void
.end method
