.class public final Ll/ۚᩳ;
.super Ljava/lang/Object;
.source "TB8W"


# instance fields
.field public ֫:Landroid/content/Intent;

.field public ۧ:I

.field public ܽ:I

.field public final ᩳ:Landroid/content/IntentSender;


# direct methods
.method public constructor <init>(Landroid/content/IntentSender;)V
    .locals 1

    const-string v0, "intentSender"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚᩳ;->ᩳ:Landroid/content/IntentSender;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۠ᩳ;
    .locals 5

    .line 158
    new-instance v0, Ll/۠ᩳ;

    iget-object v1, p0, Ll/ۚᩳ;->֫:Landroid/content/Intent;

    iget v2, p0, Ll/ۚᩳ;->ۧ:I

    iget v3, p0, Ll/ۚᩳ;->ܽ:I

    iget-object v4, p0, Ll/ۚᩳ;->ᩳ:Landroid/content/IntentSender;

    invoke-direct {v0, v4, v1, v2, v3}, Ll/۠ᩳ;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0
.end method

.method public final ֫(II)V
    .locals 0

    .line 147
    iput p1, p0, Ll/ۚᩳ;->ܽ:I

    .line 148
    iput p2, p0, Ll/ۚᩳ;->ۧ:I

    return-void
.end method

.method public final ֫(Landroid/content/Intent;)V
    .locals 0

    .line 132
    iput-object p1, p0, Ll/ۚᩳ;->֫:Landroid/content/Intent;

    return-void
.end method
