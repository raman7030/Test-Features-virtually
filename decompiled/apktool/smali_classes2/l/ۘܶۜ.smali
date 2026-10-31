.class public final synthetic Ll/ۘܶۜ;
.super Ljava/lang/Object;
.source "W8GL"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic ֫:Ll/᩸ܶۜ;

.field public final synthetic ۧ:Ll/᩵᩶ۜ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ܶۜ;Ll/᩵᩶ۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘܶۜ;->֫:Ll/᩸ܶۜ;

    iput-object p2, p0, Ll/ۘܶۜ;->ۧ:Ll/᩵᩶ۜ;

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 0
    iget-object p1, p0, Ll/ۘܶۜ;->֫:Ll/᩸ܶۜ;

    iget-object v0, p0, Ll/ۘܶۜ;->ۧ:Ll/᩵᩶ۜ;

    invoke-static {p1, v0}, Ll/᩸ܶۜ;->֫(Ll/᩸ܶۜ;Ll/᩵᩶ۜ;)V

    return-void
.end method
