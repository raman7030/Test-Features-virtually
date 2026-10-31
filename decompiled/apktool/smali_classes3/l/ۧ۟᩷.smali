.class public final synthetic Ll/ۧ۟᩷;
.super Ljava/lang/Object;
.source "M1KQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩵۟᩷;

.field public final synthetic ᩹:Ll/ܿۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩵۟᩷;Ll/ܿۛ᩷;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ۟᩷;->᩸:Ll/᩵۟᩷;

    iput-object p2, p0, Ll/ۧ۟᩷;->᩹:Ll/ܿۛ᩷;

    iput p3, p0, Ll/ۧ۟᩷;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 122
    new-instance v0, Ll/ܽ۟᩷;

    iget-object v1, p0, Ll/ۧ۟᩷;->᩸:Ll/᩵۟᩷;

    iget-object v2, p0, Ll/ۧ۟᩷;->᩹:Ll/ܿۛ᩷;

    iget v3, p0, Ll/ۧ۟᩷;->᩶:I

    invoke-direct {v0, v1, v2, v3}, Ll/ܽ۟᩷;-><init>(Ll/᩵۟᩷;Ll/ܿۛ᩷;I)V

    .line 177
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
