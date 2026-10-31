.class public final synthetic Ll/ܿ۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ܿۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ܿۛ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۫᩷;->᩸:Ll/ܿۛ᩷;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/۫ۧۢ;

    .line 4
    sget v0, Ll/ܿۛ᩷;->ۛۧ:I

    if-eqz p1, :cond_0

    .line 303
    iget-object v0, p0, Ll/ܿ۫᩷;->᩸:Ll/ܿۛ᩷;

    invoke-virtual {p1, v0}, Ll/۫ۧۢ;->ۧ(Ll/ܿۛ᩷;)V

    :cond_0
    return-void
.end method
