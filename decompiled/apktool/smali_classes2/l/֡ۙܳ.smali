.class public final synthetic Ll/֡ۙܳ;
.super Ljava/lang/Object;
.source "L73L"

# interfaces
.implements Ll/۠ۙܳ;


# instance fields
.field public final synthetic ֫:Ll/۫ۘܽ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۘܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۙܳ;->֫:Ll/۫ۘܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 47
    iget-object v0, p0, Ll/֡ۙܳ;->֫:Ll/۫ۘܽ;

    invoke-virtual {v0, p1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Ll/۫ۘܽ;->matches()Z

    move-result p1

    return p1
.end method
