.class public final Ll/֨ܳ֫;
.super Ljava/lang/Object;
.source "RB93"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۙ᩷֫;

.field public final synthetic ᩹:Ll/᩸ܳ֫;


# direct methods
.method public constructor <init>(Ll/᩸ܳ֫;Ll/ۙ᩷֫;)V
    .locals 0

    .line 722
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܳ֫;->᩹:Ll/᩸ܳ֫;

    iput-object p2, p0, Ll/֨ܳ֫;->᩸:Ll/ۙ᩷֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 725
    iget-object v0, p0, Ll/֨ܳ֫;->᩹:Ll/᩸ܳ֫;

    invoke-virtual {v0}, Ll/ܶܳ֫;->֫()V

    const/4 v0, 0x2

    .line 726
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 727
    iget-object v0, p0, Ll/֨ܳ֫;->᩸:Ll/ۙ᩷֫;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method
