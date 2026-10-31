.class public final synthetic Ll/֫ᩳۢ;
.super Ljava/lang/Object;
.source "4BN4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩷ᩳۢ;

.field public final synthetic ᩹:Ll/ܳۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩷ᩳۢ;Ll/᩷ۧۢ;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ᩳۢ;->᩸:Ll/᩷ᩳۢ;

    check-cast p2, Ll/ܳۛ᩷;

    iput-object p2, p0, Ll/֫ᩳۢ;->᩹:Ll/ܳۛ᩷;

    iput p3, p0, Ll/֫ᩳۢ;->᩶:I

    iput p4, p0, Ll/֫ᩳۢ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget v0, p0, Ll/֫ᩳۢ;->᩶:I

    iget v1, p0, Ll/֫ᩳۢ;->ۙ:I

    iget-object v2, p0, Ll/֫ᩳۢ;->᩸:Ll/᩷ᩳۢ;

    iget-object v3, p0, Ll/֫ᩳۢ;->᩹:Ll/ܳۛ᩷;

    invoke-static {v2, v3, v0, v1}, Ll/᩷ᩳۢ;->֫(Ll/᩷ᩳۢ;Ll/᩷ۧۢ;II)V

    return-void
.end method
