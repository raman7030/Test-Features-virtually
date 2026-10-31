.class public final synthetic Ll/۟ۜۢ;
.super Ljava/lang/Object;
.source "O1JS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۧ᩷ۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ۧ᩷ۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۜۢ;->᩸:Ll/ۧ᩷ۢ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 728
    new-instance v0, Ll/ۤܿۢ;

    iget-object v1, p0, Ll/۟ۜۢ;->᩸:Ll/ۧ᩷ۢ;

    iget-object v1, v1, Ll/ۧ᩷ۢ;->᩶:Ll/ܳ᩷ۢ;

    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v2

    check-cast v2, Ll/ܿۛ᩷;

    invoke-static {v1}, Ll/ܳ᩷ۢ;->ܽ(Ll/ܳ᩷ۢ;)Ll/۫ۧۢ;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ll/ۤܿۢ;-><init>(Ll/ܿۛ᩷;Ll/۫ۧۢ;)V

    invoke-static {v1}, Ll/ܳ᩷ۢ;->ᩳ(Ll/ܳ᩷ۢ;)Ljava/util/Stack;

    move-result-object v1

    .line 729
    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۛ᩷;

    invoke-virtual {v0, v1}, Ll/ۤܿۢ;->֫(Ll/֨ۛ᩷;)V

    .line 730
    invoke-virtual {v0}, Ll/ۤܿۢ;->֫()V

    return-void
.end method
