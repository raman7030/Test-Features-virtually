.class public final Ll/᩸ۨ᩻;
.super Ljava/lang/Object;
.source "4778"

# interfaces
.implements Ll/۬ۨ᩻;


# instance fields
.field public final ֫:Ll/᩹ۨ᩻;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩹ۨ᩻;)V
    .locals 0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    iput-object p1, p0, Ll/᩸ۨ᩻;->֫:Ll/᩹ۨ᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Ll/᩸ۨ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 152
    iget-object v0, p0, Ll/᩸ۨ᩻;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 153
    iget-object v1, p0, Ll/᩸ۨ᩻;->֫:Ll/᩹ۨ᩻;

    invoke-virtual {v1, v0, p1}, Ll/᩹ۨ᩻;->֫(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
