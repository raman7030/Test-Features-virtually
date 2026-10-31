.class public final synthetic Ll/ᩳۚ᩻;
.super Ljava/lang/Object;
.source "R9TK"

# interfaces
.implements Ll/᩻ۚ᩻;


# instance fields
.field public final synthetic ֫:Ll/ۜۚ᩻;

.field public final synthetic ۧ:J


# direct methods
.method public synthetic constructor <init>(Ll/ۜۚ᩻;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۚ᩻;->֫:Ll/ۜۚ᩻;

    iput-wide p2, p0, Ll/ᩳۚ᩻;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/OutputStream;)V
    .locals 3

    .line 2
    iget-wide v0, p0, Ll/ᩳۚ᩻;->ۧ:J

    .line 126
    iget-object v2, p0, Ll/ᩳۚ᩻;->֫:Ll/ۜۚ᩻;

    iget-object v2, v2, Ll/ۜۚ᩻;->᩸:Ll/۟֡᩻;

    invoke-virtual {v2, p1, v0, v1}, Ll/۟֡᩻;->֫(Ljava/io/OutputStream;J)V

    return-void
.end method
