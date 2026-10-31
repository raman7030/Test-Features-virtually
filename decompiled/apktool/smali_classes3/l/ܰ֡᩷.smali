.class public final synthetic Ll/ܰ֡᩷;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/֨ܿܳ;

.field public final synthetic ᩹:Ll/ᩴܿܳ;


# direct methods
.method public synthetic constructor <init>(Ll/֨ܿܳ;Ll/ᩴܿܳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ֡᩷;->᩸:Ll/֨ܿܳ;

    iput-object p2, p0, Ll/ܰ֡᩷;->᩹:Ll/ᩴܿܳ;

    iput-object p3, p0, Ll/ܰ֡᩷;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    sget-object v0, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    const/4 v0, 0x0

    .line 209
    iget-object v1, p0, Ll/ܰ֡᩷;->᩸:Ll/֨ܿܳ;

    iget-object v2, p0, Ll/ܰ֡᩷;->᩹:Ll/ᩴܿܳ;

    iget-object v3, p0, Ll/ܰ֡᩷;->᩶:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Ll/֨ܿܳ;->֫(Ll/ᩴܿܳ;Ljava/lang/String;Z)V

    return-void
.end method
