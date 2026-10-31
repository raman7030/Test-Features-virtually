.class public final synthetic Ll/֨۟᩷;
.super Ljava/lang/Object;
.source "O1JS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۠۟᩷;


# direct methods
.method public synthetic constructor <init>(Ll/۠۟᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨۟᩷;->᩸:Ll/۠۟᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 561
    iget-object v0, p0, Ll/֨۟᩷;->᩸:Ll/۠۟᩷;

    iget-object v1, v0, Ll/۠۟᩷;->ۗ:Ll/ۛ۟᩷;

    invoke-static {v1}, Ll/ۛ۟᩷;->ۧ(Ll/ۛ۟᩷;)Ll/ۤ۟᩷;

    move-result-object v2

    invoke-virtual {v0}, Ll/ۗ۬ۧ;->getAdapterPosition()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 562
    invoke-static {v1}, Ll/ۛ۟᩷;->᩻(Ll/ۛ۟᩷;)V

    return-void
.end method
