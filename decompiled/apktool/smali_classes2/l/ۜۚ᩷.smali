.class public final synthetic Ll/ۜۚ᩷;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ᩳۜܳ;

.field public final synthetic ᩹:Ll/ۤᩳܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳۜܳ;Ll/ۤᩳܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۚ᩷;->᩸:Ll/ᩳۜܳ;

    iput-object p2, p0, Ll/ۜۚ᩷;->᩹:Ll/ۤᩳܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    sget-object v0, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    const/16 v0, 0x7d0

    .line 216
    iget-object v1, p0, Ll/ۜۚ᩷;->᩸:Ll/ᩳۜܳ;

    invoke-static {v1, v0}, Ll/ۢۘܳ;->֫(Ll/ᩳۜܳ;I)V

    .line 144
    iget-object v0, p0, Ll/ۜۚ᩷;->᩹:Ll/ۤᩳܳ;

    invoke-virtual {v0}, Ll/ۤᩳܳ;->run()V

    return-void
.end method
