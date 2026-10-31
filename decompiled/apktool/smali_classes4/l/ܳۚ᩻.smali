.class public final synthetic Ll/ܳۚ᩻;
.super Ljava/lang/Object;
.source "R9TK"

# interfaces
.implements Ll/᩻ۚ᩻;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۚ᩻;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/OutputStream;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܳۚ᩻;->֫:Ljava/lang/String;

    .line 223
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
