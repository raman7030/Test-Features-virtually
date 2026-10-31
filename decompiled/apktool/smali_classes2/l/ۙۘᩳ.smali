.class public final synthetic Ll/ۙۘᩳ;
.super Ljava/lang/Object;
.source "06TX"


# instance fields
.field public final synthetic ֫:Ll/᩷۠ᩴ;

.field public final synthetic ۧ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۙۘᩳ;->֫:Ll/᩷۠ᩴ;

    iput-object p1, p0, Ll/ۙۘᩳ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/io/InputStream;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۙۘᩳ;->֫:Ll/᩷۠ᩴ;

    iget-object v1, p0, Ll/ۙۘᩳ;->ۧ:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;Ljava/lang/String;I)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
