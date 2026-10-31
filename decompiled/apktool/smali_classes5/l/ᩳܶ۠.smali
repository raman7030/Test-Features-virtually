.class public final synthetic Ll/ᩳܶ۠;
.super Ljava/lang/Object;
.source "O433"

# interfaces
.implements Ll/ܿܶ۠;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܶ۠;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/Locale;)Ljava/util/ResourceBundle;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ᩳܶ۠;->֫:Ljava/lang/String;

    .line 121
    invoke-static {v0, p1}, Ljava/util/ResourceBundle;->getBundle(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/ResourceBundle;

    move-result-object p1

    return-object p1
.end method
